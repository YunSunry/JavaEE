package com.javan.entity;

public class Worker {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker.worker_id
     *
     * @mbg.generated
     */
    private Integer workerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker.worker_name
     *
     * @mbg.generated
     */
    private String workerName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker.worker_age
     *
     * @mbg.generated
     */
    private Integer workerAge;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker.woker_sex
     *
     * @mbg.generated
     */
    private String wokerSex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker.worker_wage
     *
     * @mbg.generated
     */
    private Integer workerWage;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker.worker_id
     *
     * @return the value of worker.worker_id
     *
     * @mbg.generated
     */
    public Integer getWorkerId() {
        return workerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker.worker_id
     *
     * @param workerId the value for worker.worker_id
     *
     * @mbg.generated
     */
    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker.worker_name
     *
     * @return the value of worker.worker_name
     *
     * @mbg.generated
     */
    public String getWorkerName() {
        return workerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker.worker_name
     *
     * @param workerName the value for worker.worker_name
     *
     * @mbg.generated
     */
    public void setWorkerName(String workerName) {
        this.workerName = workerName == null ? null : workerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker.worker_age
     *
     * @return the value of worker.worker_age
     *
     * @mbg.generated
     */
    public Integer getWorkerAge() {
        return workerAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker.worker_age
     *
     * @param workerAge the value for worker.worker_age
     *
     * @mbg.generated
     */
    public void setWorkerAge(Integer workerAge) {
        this.workerAge = workerAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker.woker_sex
     *
     * @return the value of worker.woker_sex
     *
     * @mbg.generated
     */
    public String getWokerSex() {
        return wokerSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker.woker_sex
     *
     * @param wokerSex the value for worker.woker_sex
     *
     * @mbg.generated
     */
    public void setWokerSex(String wokerSex) {
        this.wokerSex = wokerSex == null ? null : wokerSex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker.worker_wage
     *
     * @return the value of worker.worker_wage
     *
     * @mbg.generated
     */
    public Integer getWorkerWage() {
        return workerWage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker.worker_wage
     *
     * @param workerWage the value for worker.worker_wage
     *
     * @mbg.generated
     */
    public void setWorkerWage(Integer workerWage) {
        this.workerWage = workerWage;
    }
}