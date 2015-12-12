package timgo.controllers;

import timgo.common.Paths;
import timgo.model.entities.Publication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import timgo.services.PublicationService;

import java.util.List;

@RestController
public class PublicationController {
    @Autowired
    private PublicationService publicationService;

    @RequestMapping(value = Paths.GET_PUBLICATIONS_METHOD)
    public List<Publication> getPublications() {
        return publicationService.getPublications();
    }
}
