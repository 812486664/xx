package com.heshuijinjuan.service.common.fe;

/**
 * 反馈页面提交表单
 */
public class FeedbackDto {
    private Long id;

    private String name;

    private String school;

    private String schoolBelong;

    private String phone;

    private String productName;

    private String subject;

    private String advice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchoolBelong() {
        return schoolBelong;
    }

    public void setSchoolBelong(String schoolBelong) {
        this.schoolBelong = schoolBelong;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }
}
