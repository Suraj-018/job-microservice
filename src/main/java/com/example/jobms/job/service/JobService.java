package com.example.jobms.job.service;


import com.example.jobms.job.dto.JobDTO;
import com.example.jobms.job.entity.Job;

import java.util.List;

public interface JobService {

    List<JobDTO> findAllJobs();

    void createJob(Job job);

    JobDTO findJobById(Long id);

    boolean updateJobById(Long id, Job updatedJob);

    boolean deleteJobById(Long id);
}
