package samples.actions;

import com.harium.chatbot.slack.ChannelHistoryModule;
import com.harium.chatbot.slack.SlackChannel;
import com.harium.chatbot.slack.SlackSession;
import com.harium.chatbot.slack.events.SlackMessagePosted;
import com.harium.chatbot.slack.impl.ChannelHistoryModuleFactory;
import org.threeten.bp.LocalDate;

import java.util.List;

/**
 * This sample code is showing various ways on how to query a channel message history assuming you already have a SlackSession
 */
public class FetchingMessageHistory {
    /**
     * This method how to get the message history from a given channel (by default, 1000 max messages are fetched)
     */
    public static List<SlackMessagePosted> fetchSomeMessagesFromChannelHistory(SlackSession session, SlackChannel slackChannel) {
        //build a channelHistory module from the slack session
        ChannelHistoryModule channelHistoryModule = ChannelHistoryModuleFactory.createChannelHistoryModule(session);

        List<SlackMessagePosted> messages = channelHistoryModule.fetchHistoryOfChannel(slackChannel.getId());
        return messages;
    }

    /**
     * This method how to get the 10 last messages from the message history of a given channel
     */
    public static List<SlackMessagePosted> fetchTenLastMessagesFromChannelHistory(SlackSession session, SlackChannel slackChannel) {
        //build a channelHistory module from the slack session
        ChannelHistoryModule channelHistoryModule = ChannelHistoryModuleFactory.createChannelHistoryModule(session);

        List<SlackMessagePosted> messages = channelHistoryModule.fetchHistoryOfChannel(slackChannel.getId(), 10);
        return messages;
    }

    /**
     * This method how to get the message history on a given date from a given channel (by default, 1000 max messages are fetched)
     */
    public static List<SlackMessagePosted> fetchMessagesOfGivenDateFromChannelHistory(SlackSession session, SlackChannel slackChannel, LocalDate date) {
        //build a channelHistory module from the slack session
        ChannelHistoryModule channelHistoryModule = ChannelHistoryModuleFactory.createChannelHistoryModule(session);

        List<SlackMessagePosted> messages = channelHistoryModule.fetchHistoryOfChannel(slackChannel.getId(), date);
        return messages;
    }

    /**
     * This method how to get the 10 last message of a given date from the message history of a given channel
     */
    public static List<SlackMessagePosted> fetchTenLastMessagesOfGivenDateFromChannelHistory(SlackSession session, SlackChannel slackChannel, LocalDate date) {
        //build a channelHistory module from the slack session
        ChannelHistoryModule channelHistoryModule = ChannelHistoryModuleFactory.createChannelHistoryModule(session);

        List<SlackMessagePosted> messages = channelHistoryModule.fetchHistoryOfChannel(slackChannel.getId(), date, 10);
        return messages;
    }

}
