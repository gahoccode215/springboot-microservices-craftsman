package com.devteria.profile.repository;

import com.devteria.profile.entity.UserProfile;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UserProfileRepository extends Neo4jRepository<UserProfile, String> {}
