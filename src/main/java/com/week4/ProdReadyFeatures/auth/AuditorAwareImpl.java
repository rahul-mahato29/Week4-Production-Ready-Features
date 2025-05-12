package com.week4.ProdReadyFeatures.auth;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        //this method return the name of the current Auditor(meaning logged-in user)
        return Optional.of("Rahul Mahato"); //hardcoded, because not implemented auth yet
    }
}
