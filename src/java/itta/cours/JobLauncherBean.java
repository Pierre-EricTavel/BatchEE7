/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itta.cours;

import java.util.List;
import java.util.Properties;
import javax.batch.operations.JobExecutionIsRunningException;
import javax.batch.operations.JobExecutionNotRunningException;
import javax.batch.operations.JobOperator;
import javax.batch.operations.JobSecurityException;
import javax.batch.operations.NoSuchJobExecutionException;
import javax.batch.runtime.BatchRuntime;
import javax.batch.runtime.JobInstance;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "jobLauncher")
@RequestScoped
public class JobLauncherBean {

    public void startPerrin() {
        JobOperator jo = BatchRuntime.getJobOperator();
        Properties props = new Properties();

        jo.start("perrinJob", props);

    }

    public void stopAllJobs() {
        JobOperator jo = BatchRuntime.getJobOperator();
        jo.getRunningExecutions("perrinJob").forEach(j -> {
            System.out.println("stopping " + j);
            jo.stop(j.longValue());
        });
        System.out.println(jo.getJobInstanceCount("perrinJob"));
        List<JobInstance> lji = jo.getJobInstances("perrinJob", 0, jo.getJobInstanceCount("perrinJob"));
        lji.forEach(
                ji -> {
                    try {
                        jo.abandon(ji.getInstanceId());
                    } catch (JobExecutionIsRunningException | JobSecurityException | NoSuchJobExecutionException ex) {    }
                    try {
                        jo.stop(ji.getInstanceId());
                    } catch (JobExecutionNotRunningException | JobSecurityException | NoSuchJobExecutionException ex) {     }

                }
        );

    }

}
