package win.foxybot.roxy.events;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Objects;

public class UserRemoveModule extends ListenerAdapter {
    public void onGuildMemberRemove(GuildMemberRemoveEvent event) {
        Guild foxyGuild = event.getJDA().getGuildById("768267522670723094");

        assert foxyGuild != null;
        Objects.requireNonNull(foxyGuild.getTextChannelById("768268325528403989"))
                .getManager().setTopic("<:foxy_howdy:853366973751885854> Chat Geral | Estamos com " + foxyGuild.getMemberCount() + " membros! \n\n**<:foxy_drinking_coffee:1071119512352591974> Convite do servidor: https://discord.gg/6mG2xDtuZD**\n" +
                        "**<:foxy_yay:1070906796274888795> Adicione a Foxy em seu servidor: https://foxybot.win/add**\n" +
                        "**<:foxysunglasses:890688144280784926> Website da Foxy: https://foxybot.win**\n" +
                        "**:heart: Vote na Foxy: https://top.gg/bot/1006520438865801296/vote**\n" +
                        "**<:GitHub:746399300728258710> Código-Fonte da Foxy: https://github.com/FoxyTheBot/Foxy**\n" +
                        "\n" +
                        "Aqui você pode falar sobre qualquer coisa, portanto que siga as <#768268318633099325> né\n" +
                        "\n" +
                        "Use comandos da Foxy e outros bots em <#772182949276680232>\n" +
                        "\n" +
                        "<:ShiroFoxy:934469525997518848> Obrigado por usar a <@1006520438865801296> :3").queue();
    }
}
