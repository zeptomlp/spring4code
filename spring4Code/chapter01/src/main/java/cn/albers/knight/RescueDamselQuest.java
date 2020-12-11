package cn.albers.knight;

import lombok.extern.slf4j.Slf4j;

/**
 * @version: V1.0
 * @author: Albers
 * @date: 2020/10/19
 * @description:
 */
@Slf4j
public class RescueDamselQuest implements Quest {

    @Override
    public void embark() {
        log.info("Embarking on a quest to rescue the damsel.");
    }

}
