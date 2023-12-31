package com.myprohect.springsecurityoauth2jwt.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String password;
    private String name;
    private String nickname;
    private String profileImage;
    private String role;
    @Column(name = "create_date")
    @CreationTimestamp
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private String provider;
    private String providerId;
}
