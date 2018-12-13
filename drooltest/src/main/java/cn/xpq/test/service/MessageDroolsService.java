package cn.xpq.test.service;

import cn.xpq.test.model.Message;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

@Service
public class MessageDroolsService {

    public String fireRule(){

        KieServices kieServices = KieServices.Factory.get();
        KieContainer container = kieServices.getKieClasspathContainer();
        KieSession kieSession = container.newKieSession("messaage-rule");

        Message message = new Message();
        message.setStatus(Message.GOODBYE);
        message.setMessage("hi littleting");
        kieSession.insert(message);
        kieSession.fireAllRules();
        kieSession.dispose();
        System.out.println(message);
        return message.getMessage();

    }
}
