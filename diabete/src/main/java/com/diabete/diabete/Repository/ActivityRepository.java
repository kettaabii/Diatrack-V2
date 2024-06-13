package com.diabete.diabete.Repository;

import com.diabete.diabete.Models.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity,Long> {
}