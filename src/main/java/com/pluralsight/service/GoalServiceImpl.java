package com.pluralsight.service;

import com.pluralsight.dao.GoalDao;
import com.pluralsight.model.Goal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by alex on 06.03.17.
 */
@Service("goalService")
public class GoalServiceImpl implements GoalService {

    @Autowired
    GoalDao goalDao;

    @Transactional
    public Goal save(Goal goal) {
        return goalDao.save(goal);
    }
}
