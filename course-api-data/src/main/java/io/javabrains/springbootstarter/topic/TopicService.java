/**
 * 
 */
package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Dhaval
 *
 */

@Service
public class TopicService {

	@Autowired
	private TopicDataService topicDataService;
	
	
	public List<Topic> getAllTopics(){
		List<Topic> allTopicList = new ArrayList<>();
		topicDataService.findAll().forEach(allTopicList::add);
		return allTopicList;
	}
	
	public Topic getTopic(String id){
		return topicDataService.findOne(id);
	}

	public void addTopic(Topic topic) {
		topicDataService.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		
		topicDataService.save(topic);		/** Topic instance contains the id field 
											 *  and hence if the particular id is already present then it is updated 
											 *	else a new record is inserted.
											 */
	}

	public void deleteTopic(String id) {
		topicDataService.delete(id);
	}
}
