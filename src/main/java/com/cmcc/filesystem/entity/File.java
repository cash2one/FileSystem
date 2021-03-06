package com.cmcc.filesystem.entity;

import java.io.Serializable;
import java.util.Date;

public class File implements Serializable {
    private Long id;

    private String fileId;

    private String fileTitle;

    private String issueUserName;
    
    private Long issueUserId;

    private String generateWord;

    private String generateType;

    private String generateAgency;

    private String generateDistrict;

    private String generatePage;

    private Date generateDate;

    private Long receiveUserId;

    private Long belongedDeptId;

    private String emergencyLevel;

    private String secretLevel;

    private Long auditorId;

    private String auditSerials;

    private Date auditDate;

    private String auditResult;

    private Date fillingDate;

    private Boolean isBorrowed;

    private Long borrowerId;

    private Boolean state;

    private String location;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof File) {
            File f = (File)obj;
            return this.id == f.id;
        }
        
        return false;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIssueUserName() {
        return issueUserName;
    }

    public void setIssueUserName(String issueUserName) {
        this.issueUserName = issueUserName;
    }

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    public String getFileTitle() {
        return fileTitle;
    }

    public void setFileTitle(String fileTitle) {
        this.fileTitle = fileTitle == null ? null : fileTitle.trim();
    }

    public Long getIssueUserId() {
        return issueUserId;
    }

    public void setIssueUserId(Long issueUserId) {
        this.issueUserId = issueUserId;
    }

    public String getGenerateWord() {
        return generateWord;
    }

    public void setGenerateWord(String generateWord) {
        this.generateWord = generateWord == null ? null : generateWord.trim();
    }

    public String getGenerateType() {
        return generateType;
    }

    public void setGenerateType(String generateType) {
        this.generateType = generateType == null ? null : generateType.trim();
    }

    public String getGenerateAgency() {
        return generateAgency;
    }

    public void setGenerateAgency(String generateAgency) {
        this.generateAgency = generateAgency == null ? null : generateAgency.trim();
    }

    public String getGenerateDistrict() {
        return generateDistrict;
    }

    public void setGenerateDistrict(String generateDistrict) {
        this.generateDistrict = generateDistrict == null ? null : generateDistrict.trim();
    }

    public String getGeneratePage() {
        return generatePage;
    }

    public void setGeneratePage(String generatePage) {
        this.generatePage = generatePage == null ? null : generatePage.trim();
    }

    public Date getGenerateDate() {
        return generateDate;
    }

    public void setGenerateDate(Date generateDate) {
        this.generateDate = generateDate;
    }

    public Long getReceiveUserId() {
        return receiveUserId;
    }

    public void setReceiveUserId(Long receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    public Long getBelongedDeptId() {
        return belongedDeptId;
    }

    public void setBelongedDeptId(Long belongedDeptId) {
        this.belongedDeptId = belongedDeptId;
    }

    public String getEmergencyLevel() {
        return emergencyLevel;
    }

    public void setEmergencyLevel(String emergencyLevel) {
        this.emergencyLevel = emergencyLevel == null ? null : emergencyLevel.trim();
    }

    public String getSecretLevel() {
        return secretLevel;
    }

    public void setSecretLevel(String secretLevel) {
        this.secretLevel = secretLevel == null ? null : secretLevel.trim();
    }

    public Long getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(Long auditorId) {
        this.auditorId = auditorId;
    }

    public String getAuditSerials() {
        return auditSerials;
    }

    public void setAuditSerials(String auditSerials) {
        this.auditSerials = auditSerials == null ? null : auditSerials.trim();
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public String getAuditResult() {
        return auditResult;
    }

    public void setAuditResult(String auditResult) {
        this.auditResult = auditResult;
    }

    public Date getFillingDate() {
        return fillingDate;
    }

    public void setFillingDate(Date fillingDate) {
        this.fillingDate = fillingDate;
    }

    public Boolean getIsBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed(Boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public Long getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(Long borrowerId) {
        this.borrowerId = borrowerId;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}