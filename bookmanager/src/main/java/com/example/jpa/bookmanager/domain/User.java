package com.example.jpa.bookmanager.domain;

import lombok.*;

import java.time.LocalDateTime;

//@Getter
//@Setter
//@ToString
//@NoArgsConstructor // 변수가 없는 생성자
//@AllArgsConstructor // 모든 필드 생성자
//@RequiredArgsConstructor // @Nonnull로 표기한 필드를 기준으로 생성자
//@EqualsAndHashCode // 값을 이용하여 해시코드 생성
//@Data // Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
//@Builder // User.Builder().name("A").build() 형식으로 생성 및 활용
public class User {
    private String name;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


}
