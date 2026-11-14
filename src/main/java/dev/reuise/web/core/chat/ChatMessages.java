package dev.reuise.web.core.chat;

import dev.reuise.web.core.text.WebParagraph;

/** Helpers for plain-text messages; the application owns the conversation and its retention. */
public final class ChatMessages {
    private ChatMessages() {}

    public static WebParagraph append(WebChatBox chat, String author, String text) {
        if (chat == null) throw new IllegalArgumentException("chat is required");
        String body = text == null ? "" : text;
        String caption = author == null || author.trim().isEmpty() ? body : author + ": " + body;
        var options = chat.getComponentFactory().createParagraphOptions();
        options.setText(caption);
        WebParagraph paragraph = chat.getComponentFactory().createParagraph(options);
        chat.getMessages().add(paragraph);
        return paragraph;
    }

    public static void clear(WebChatBox chat) {
        chat.getMessages().removeAll();
    }
}
