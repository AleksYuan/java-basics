package org.itmo.java.lesson6.extra.repository;

import org.itmo.java.lesson6.extra.dao.Document;

import java.util.List;

public interface DocumentRepository {
    Document findBy(Long id);
    void save(Document document);
    void delete(Long id);
    List<Document> getDocuments();
}
