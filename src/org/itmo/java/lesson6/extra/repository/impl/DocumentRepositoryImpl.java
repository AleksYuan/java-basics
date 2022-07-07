package org.itmo.java.lesson6.extra.repository.impl;

import org.itmo.java.lesson6.extra.dao.Document;
import org.itmo.java.lesson6.extra.repository.DocumentRepository;

import java.util.ArrayList;
import java.util.List;

public class DocumentRepositoryImpl implements DocumentRepository {
    private List<Document> documents = new ArrayList<>();
    private static long id = 1;

    {
        Document csv = new Document(12, "csv", true);
        csv.setId(id++);
        this.documents.add(csv);
    }

    @Override
    public Document findBy(Long id) {
        Document document = null;
        for (Document doc : this.documents) {
            if(doc.getId().equals(id)) {
                document = doc;
            }
        }
        return document;
    }

    @Override
    public void save(Document document) {
        Document docByID = findBy(document.getId());
        if (docByID != null) {
            delete(docByID.getId());
        } else {
            document.setId(id++);
            }
        this.documents.add((document));
        }


    @Override
    public void delete(Long id) {
        Document document = findBy(id);
        if (document != null) {
            documents.remove(document);
        } else {
            System.err.printf("Documents with id: %d is not found", id);
        }
    }

    @Override
    public List<Document> getDocuments() {
        return this.documents;
    }
}
