package com.hanhwa_tae.gulhan.travelmatepost.command.domain.aggregate;

import com.hanhwa_tae.gulhan.common.domain.DeleteType;
import com.hanhwa_tae.gulhan.user.command.domain.aggregate.User;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table(name = "travel_mate_post")
@EntityListeners(AuditingEntityListener.class)
@Getter @Setter
@SQLDelete(sql = "UPDATE travel_mate_post SET is_deleted = 'Y' WHERE travel_mate_post_id = ?")
public class TravelMatePost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int travelMatePostId;

    private String title;

    @Lob
    private String content;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    @Enumerated(EnumType.STRING)
    private DeleteType isDeleted = DeleteType.N;

    @ManyToOne
    @JoinColumn(name = "user_no", nullable = false)
    private User user;


    public void updateProductDetails(@NotBlank(message = "제목을 입력하세요") String title, @NotBlank(message = "내용을 입력하세요.") String content) {
        if(title != null) this.title = title;
        if(content != null) this.content = content;
    }
}