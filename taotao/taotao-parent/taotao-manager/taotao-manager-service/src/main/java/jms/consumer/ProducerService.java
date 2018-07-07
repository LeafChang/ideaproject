package jms.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.print.attribute.standard.Destination;

@Service
public class ProducerService {

    @Autowired
    @Qualifier("jmsQueueTemplate")
    private JmsTemplate jmsQueueTemplate;

    @Autowired
    @Qualifier("jmsTopicTemplate")
    private JmsTemplate jmsTopicTemplate;


    public void  sendMessage(Destination destination,final String message){
        System.out.println("msg:"+message+"to destnation :" + destination.getName());
       /* MessageCreator messageCreator = new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return null;
            }
        };
*/
        //jmsQueueTemplate.send(destination,messageCreator);
    }




}
