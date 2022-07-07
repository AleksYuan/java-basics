package org.itmo.java.lesson6.extra.service.impl;

import org.itmo.java.lesson6.extra.dao.Document;
import org.itmo.java.lesson6.extra.repository.DocumentRepository;
import org.itmo.java.lesson6.extra.repository.impl.DocumentRepositoryImpl;
import org.itmo.java.lesson6.extra.service.Service;

import java.util.List;

public class ServiceImpl implements Service {

    private DocumentRepository documentRepository = new DocumentRepositoryImpl();

    @Override
    public Document create(Integer pageCount, String format, Boolean isEditAble) {
        Document document = new Document(pageCount, format, isEditAble);
        documentRepository.save(document);
        return document;
    }

    @Override
    public Document read(Long id) {
        return documentRepository.findBy(id);
    }

    @Override
    public Document update(Document document) {
        documentRepository.save(document);
        return document;
    }

    @Override
    public void delete(Long id) {
        documentRepository.delete(id);
    }

    @Override
    public List<Document> getDocuments() {
        return documentRepository.getDocuments();
    }
}
