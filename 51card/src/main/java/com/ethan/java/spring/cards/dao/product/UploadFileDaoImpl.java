package com.ethan.java.spring.cards.dao.product;

import org.springframework.stereotype.Repository;

import com.ethan.java.spring.cards.dao.DaoSupport;
import com.ethan.java.spring.cards.model.product.UploadFile;
@Repository("uploadFileDao")
public class UploadFileDaoImpl extends DaoSupport<UploadFile> implements UploadFileDao {

}