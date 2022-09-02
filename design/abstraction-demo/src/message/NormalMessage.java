package message;

/**
 * 普通消息类
 */
public class NormalMessage extends AbstractMessage{

    public NormalMessage(IMessage message) {
        super(message);
    }

    @Override
    public void senMessage(String message, String toUser) {
        super.senMessage(message, toUser);
    }
}
