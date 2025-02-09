import { logger } from "../../utils/logger"
import { bot } from "../../index";
import { ActivityTypes } from "discordeno/types";

const setReadyEvent = (): void => {
    bot.events.ready = async (_, payload) => {
        logger.info(`[READY] Shard ${payload.shardId + 1} connected to Discord Gateway`);
        bot.helpers.editBotStatus({
            activities: [{
                name: "Adicione a Foxy: https://foxybot.win",
                createdAt: Date.now(),
                type: ActivityTypes.Game
            }],
            status: "online"
        });
    }
}

export { setReadyEvent }