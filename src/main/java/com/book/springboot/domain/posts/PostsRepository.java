package com.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    // 보통 MyBatis 등에서 Dao라고 불리는 DB Layer 접근자이다.
    // JPA에서 Repository 라고 부르며 인터페이스로 생성해야 한다.
    // 단순히 인터페이스를 생성 후, JpaRepository<Entity클래스, PK타입> 를 상속하면 기본적인 CRUD 메소드가 자동생성된다.
    // @Repository를 추가할 필요도 없다.
    // 주의!
    // - Entity클래스와 기본 Entity Repository는 함께 위치해야한다.
    // - 둘은 아주 밀접한 관계이고, Entity 클래스는 기본Repository 없이는 제대로 역할을 할 수가 없다.
}
