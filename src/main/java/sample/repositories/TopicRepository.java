package sample.repositories;


import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sample.models.Topic;

@RepositoryRestResource(collectionResourceRel = "topic", path = "sujet")
public interface TopicRepository extends PagingAndSortingRepository<Topic, Long> {

    List<Topic> findByName(@Param("name") String name);

}