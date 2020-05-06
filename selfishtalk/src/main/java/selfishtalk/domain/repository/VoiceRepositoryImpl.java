package selfishtalk.domain.repository;

import org.springframework.stereotype.Repository;
import selfishtalk.domain.model.Voice;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class VoiceRepositoryImpl implements VoiceRepository {
    private static final Map<String, Voice> VOICE_MAP = new ConcurrentHashMap<String, Voice>();

    @Override
    public Voice findOne(String voiceId) {
        return VOICE_MAP.get(voiceId);
    }

    @Override
    public Collection<Voice> findAll() {
        return VOICE_MAP.values();
    }

    @Override
    public void create(Voice voice) {
        VOICE_MAP.put(voice.getVoiceId(), voice);
    }

    @Override
    public void delete(Voice voice) {
        VOICE_MAP.remove(voice);
    }
}
