package selfishtalk.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.terasoluna.gfw.common.exception.ResourceNotFoundException;
import org.terasoluna.gfw.common.message.ResultMessage;
import org.terasoluna.gfw.common.message.ResultMessages;
import selfishtalk.domain.model.Voice;
import selfishtalk.domain.repository.VoiceRepository;

import javax.inject.Inject;
import java.util.Calendar;
import java.util.Collection;
import java.util.UUID;

@Service
public class VoiceServiceImpl implements VoiceService {

    @Inject
    VoiceRepository voiceRepository;

    @Override
    @Transactional(readOnly=true)
    public Collection<Voice> findAll() {
        return voiceRepository.findAll();
    }

    public Voice findOne(String voiceId) {
        Voice voice = voiceRepository.findOne(voiceId);
        if (voice == null) {
            ResultMessages messages = ResultMessages.error();
            messages.add(ResultMessage.fromText("[E404] The requested Voice is not found. (id=" + voiceId + ")"));
            throw new ResourceNotFoundException(messages);
        }
        return voice;
    }

    @Override
    public Voice create(Voice voice) {
        voice.setInsertDate(Calendar.getInstance());
        voice.setVoiceId(UUID.randomUUID().toString());
        voiceRepository.create(voice);
        return voice;
    }

    @Override
    public void delete(String voiceId) {
        Voice voice = voiceRepository.findOne(voiceId);
        voiceRepository.delete(voice);
    }

}
