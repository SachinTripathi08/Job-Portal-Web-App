package com.example.Job.App.service;
import java.util.List;
import com.example.Job.App.model.JobPost;
import com.example.Job.App.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;
    public void addJob(JobPost jobpost){
        repo.addJob(jobpost);
    }

    public List<JobPost> getAllJobs(){
    return repo.getAllJobs();
    }

}
