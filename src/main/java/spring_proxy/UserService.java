package spring_proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserService implements IUserService {
    @Override
    public void saveUser() {
        log.info("real logic when save user");
    }
}
