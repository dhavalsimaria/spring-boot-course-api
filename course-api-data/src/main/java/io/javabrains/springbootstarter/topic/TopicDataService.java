/**
 * 
 */
package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Dhaval
 *
 */
public interface TopicDataService extends  CrudRepository<Topic, String>{

}
