package com.example.hanspaceback.repository;

import com.example.hanspaceback.domain.DeptMember;
import com.example.hanspaceback.domain.LongReserve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LongReserveRepository extends JpaRepository<LongReserve, Long> {
}
