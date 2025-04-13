package com.hanhwa_tae.gulhan.like.command.domain.repository;

import com.hanhwa_tae.gulhan.common.domain.TargetType;
import com.hanhwa_tae.gulhan.like.command.domain.aggregate.Like;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LikeRepository extends JpaRepository<Like, String> {
    Optional<Like> findByTargetIdAndTargetTypeAndUserId(int targetId, TargetType targetType, String userId);
    void deleteByTargetIdAndTargetTypeAndUserId(int targetId, TargetType targetType, String userId);
}
