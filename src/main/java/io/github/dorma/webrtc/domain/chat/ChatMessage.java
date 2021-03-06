package io.github.dorma.webrtc.domain.chat;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ChatMessage {
    private String chatRoomId;
    private String chatMemberid;
    private String chatContent;
    private LocalDateTime chatCreatedat;
    private MessageType type;
}
