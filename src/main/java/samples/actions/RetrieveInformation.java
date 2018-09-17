package samples.actions;

import com.harium.chatbot.slack.SlackChannel;
import com.harium.chatbot.slack.SlackMessageHandle;
import com.harium.chatbot.slack.SlackSession;
import com.harium.chatbot.slack.replies.EmojiSlackReply;

import java.util.Map;

/**
 * Samples showing how to retrieve various bits of information from a slack group
 */
public class RetrieveInformation {

    /**
     * Demonstrates how to fetch glorious emoji.
     */
    public void fetchListOfEmoji(SlackSession session, SlackChannel slackChannel) {
        SlackMessageHandle<EmojiSlackReply> handle = session.listEmoji();
        Map<String, String> emojis = handle.getReply().getEmojis();

        for (String emojiName : emojis.keySet()) {
            String emojiUrl = emojis.get(emojiName);
            // you are now equipped to do glorious emoji things.
        }
    }

}
