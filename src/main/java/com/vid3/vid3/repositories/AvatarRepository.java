package com.vid3.vid3.repositories;

import com.vid3.vid3.models.avatar.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvatarRepository extends JpaRepository<Avatar, Long> {
}
