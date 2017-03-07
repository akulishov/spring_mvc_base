package com.pluralsight.dao;

import com.pluralsight.model.Goal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by alex on 06.03.17.
 */
@Repository("goalDao")
public interface GoalDao extends JpaRepository<Goal, Long> {
}
