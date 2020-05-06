package selfishtalk.domain.service;

import selfishtalk.domain.model.Voice;

import java.util.Collection;

public interface VoiceService {
    Collection<Voice> findAll();

    Voice create(Voice voice);

    void delete(String voiceId);
}
