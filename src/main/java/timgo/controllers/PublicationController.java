package timgo.controllers;

import org.springframework.web.bind.annotation.RequestParam;
import timgo.common.Paths;
import timgo.services.entities.PublicationBrief;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import timgo.services.PublicationService;
import timgo.services.entities.PublicationDetails;

import java.util.List;

@RestController
public class PublicationController {
    @Autowired
    private PublicationService publicationService;

    @RequestMapping(value = Paths.GET_PUBLICATIONS_BRIEF_METHOD)
    public List<PublicationBrief> getPublications() {
        return publicationService.getPublications();
    }

    @RequestMapping(value = Paths.GET_PUBLICATION_DETAILS_METHOD)
    public PublicationDetails getPublicationDetails(@RequestParam("id") Integer id) {
        return publicationService.getPublicationDetails(id);
    }
}