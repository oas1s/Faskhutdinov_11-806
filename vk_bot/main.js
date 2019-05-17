    const { Bot, Keyboard } = require('node-vk-bot')

    const bot = new Bot({
        token: 'f88aadf6125fcdc22cab65377efa93dde7abe7d452dd5d7e7883569494bbb3ce1d02e7d87394fd4513ef2',
        group_id: 181044309
    }).start()

    bot.get(/Hi|Hello|Hey/i, (message, exec, reply) => {
        console.log(message)
        const options =  { forward_messages: message.id }
        reply('Hello!', options)
    })