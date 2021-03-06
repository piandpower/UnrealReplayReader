package io.erosemberg.reader.data;

import io.erosemberg.reader.gamedata.GameData;
import lombok.Builder;
import lombok.Data;

import java.util.LinkedList;

/**
 * Represents the FLocalFileReplayInfo from Unreal Engine.
 *
 * @author Erik Rosemberg
 * @see <a href="https://github.com/EpicGames/UnrealEngine/blob/b70f31f6645d764bcb55829228918a6e3b571e0b/Engine/Source/Runtime/NetworkReplayStreaming/LocalFileNetworkReplayStreaming/Public/LocalFileNetworkReplayStreaming.h#L88">FLocalFileReplayInfo</a>
 * @since 21/12/2018
 */
@Data
@Builder
public class ReplayInfo<T extends GameData> {

    /**
     * The header is structured into it's own object to simplify this class.
     */
    private ReplayHeader header;
    private int headerChunkIndex;

    private LinkedList<Chunk> chunks;
    private LinkedList<Event> checkpoints;
    private LinkedList<Event> events;
    private LinkedList<ReplayData> dataChunks;

    private T gameData;
}
