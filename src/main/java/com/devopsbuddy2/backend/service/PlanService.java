package com.devopsbuddy2.backend.service;

/**
 * Created by Sheryl Dreyer on 2017/09/06.
 */

import com.devopsbuddy2.backend.persistence.domain.backend.Plan;
import com.devopsbuddy2.backend.persistence.repositories.PlanRepository;
import com.devopsbuddy2.enums.PlansEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class PlanService {

    @Autowired
    private PlanRepository planRepository;

    /**
     * Returns the plan id for the given id or null if it couldn't find one.
     * @param planId The plan id
     * @return The plan id for the given id or null if it couldn't find one.
     */
    public Plan findPlanById(int planId) {
        return planRepository.findOne(planId);
    }

    /**
     * It creates a Basic or a Pro plan.
     * @param planId The plan id
     * @return the created Plan
     * @throws IllegalArgumentException If the plan id is not 1 or 2
     */
    @Transactional
    public Plan createPlan(int planId) {

        Plan plan = null;
        if (planId == 1) {
            plan = planRepository.save(new Plan(PlansEnum.BASIC));
        } else if (planId == 2) {
            plan = planRepository.save(new Plan(PlansEnum.PRO));
        } else {
            throw new IllegalArgumentException("Plan id " + planId + " not recognised.");
        }

        return plan;
    }
}