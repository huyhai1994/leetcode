package spring_proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProxyUserService extends UserService {

    @Override
    public void saveUser() {
        try {
            log.info("[ProxyUserService] - [saveUser] - start");
            super.saveUser();
            log.info("[ProxyUserService] - [saveUser] - commit");
        } catch (Exception e) {
            log.error("[ProxyUserService] - [saveUser] - rollback");

        }
    }
}
