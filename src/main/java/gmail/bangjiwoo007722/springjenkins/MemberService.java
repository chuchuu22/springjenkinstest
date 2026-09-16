package gmail.bangjiwoo007722.springjenkins;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    void save(){
        memberRepository.save(Member.builder().age(1).email("bangjiwoo007722@gmail.com").name("name").build());

    }
}
