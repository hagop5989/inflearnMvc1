package hello.servlet.domain.member;

import java.util.HashMap;
import java.util.Map;

/*
* 동시성 문제가 고려되어있지 않음, 실무에서는 ConcurrentHashMap, AtomicLong 사용 고려
* */
public class MemberRepository {
    private static Map<Long, Member> store = new HashMap<>();
    private static Long sequence = 0L;

    private static final MemberRepository instance = new MemberRepository();

    private static MemberRepository getInstance() {
        return instance;
    }
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id) {
        return store.get(id);
    }
}
