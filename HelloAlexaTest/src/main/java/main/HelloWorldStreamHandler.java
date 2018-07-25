package main;
import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

import handlers.CancelandStopIntentHandler;
import handlers.HelpIntentHandler;
import handlers.LaunchRequestHandler;
import handlers.SessionEndedRequestHandler;
import handlers.TellRecipeIntentHandler;

public class HelloWorldStreamHandler extends SkillStreamHandler {
 
 private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new TellRecipeIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler())
                .withSkillId("Your Amazon Id")
                .build();
    }

public HelloWorldStreamHandler() {
        super(getSkill());
    }

}