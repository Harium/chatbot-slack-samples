package samples.connection;

import com.harium.chatbot.slack.SlackSession;
import com.harium.chatbot.slack.impl.SlackSessionFactory;

import java.io.IOException;

/**
 * This sample code is creating a Slack session and is connecting to slack. To get some more details on
 * how to get a token, please have a look here : https://api.slack.com/bot-users
 */
public class SlackDirectConnection {
    public static void main(String[] args) throws IOException {
        SlackSession session = SlackSessionFactory.createWebSocketSlackSession("my-bot-auth-token");
        session.connect();
    }
}
