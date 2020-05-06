package selfishtalk.domain.repository;

import selfishtalk.domain.model.Voice;

import java.util.Collection;

public interface VoiceRepository {
    Voice findOne(String voiceId);

    Collection<Voice> findAll();

    void create(Voice voice);

    void delete(Voice voice);

}
