import './styles.css'
import {ReactComponent as Instagram} from './Instagram.svg'
import {ReactComponent as Linkdin} from './Linkedin.svg'
import {ReactComponent as Youtube} from './Youtube.svg'

function Footer () {
    return (
        <footer className="main-footer">
            App desenvolvido durante a 2ª ed. do evento Semana DevSuperior
            <div className="footer-icons">
                <a href="home">
                    <Youtube />
                </a>
                <a href="home">
                    <Linkdin />
                </a>
                <a href="home">
                    <Instagram />
                </a>
            </div>
        </footer>
    )
}

export default Footer