package com.cmcc.filesystem.service;

import java.util.List;

import com.cmcc.filesystem.entity.BorrowAudit;

public interface IBorrowAuditService {
    int deleteByPrimaryKey(Long id);

    int insert(BorrowAudit record);

    int insertSelective(BorrowAudit record);

    BorrowAudit selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BorrowAudit record);

    int updateByPrimaryKey(BorrowAudit record);
    
    List<BorrowAudit> findBySelective(BorrowAudit record);
    
    List<BorrowAudit> findByFileId(Long fileId);
    
    List<BorrowAudit> findAll();
}
