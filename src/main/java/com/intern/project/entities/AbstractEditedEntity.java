package com.intern.project.entities;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class AbstractEditedEntity implements Serializable {

    @CreatedDate
    private Date cdate;
    @CreatedBy
    private Long cuser;
    @LastModifiedDate
    private Date udate;
    @LastModifiedBy
    private Long uuser;


    @Basic
    @Column(name = "cdate", updatable = false)
    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }
    @Basic
    @Column(name = "cuser", updatable = false)
    public Long getCuser() {
        return cuser;
    }

    public void setCuser(Long cuser) {
        this.cuser = cuser;
    }

    @Basic
    @Column(name = "udate", insertable = false)
    public Date getUdate() {
        return udate;
    }

    public void setUdate(Date udate) {
        this.udate = udate;
    }

    @Basic
    @Column(name = "uuser", insertable = false)
    public Long getUuser() {
        return uuser;
    }

    public void setUuser(Long uuser) {
        this.uuser = uuser;
    }
}
