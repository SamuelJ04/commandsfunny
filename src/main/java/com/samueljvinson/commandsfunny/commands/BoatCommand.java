package com.samueljvinson.commandsfunny.commands;

import org.bukkit.Material;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import javax.naming.Name;

public class SusCommand implements CommandExecutor
{
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings)
    {
        if (!(commandSender instanceof Player))
        {
            commandSender.sendMessage("Bro you aren't a player");
        }
        else
        {
            Player player = (Player) commandSender;
            ItemStack joe = new ItemStack(Material.DARK_OAK_BOAT, 12);
            ItemMeta joeMeta = joe.getItemMeta();

            joeMeta.setDisplayName("Get Boated");
            joe.setItemMeta(joeMeta);

            player.getInventory().addItem(joe);
            commandSender.sendMessage("Get boated lmao!");

        }
        return true;
    }

}
